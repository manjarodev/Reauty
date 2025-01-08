package com.app.blingy.reauty.feature.chat

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Dialog
import android.os.Bundle
import android.os.Handler
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.TextView.OnEditorActionListener
import com.app.blingy.reauty.R
import com.app.blingy.reauty.core.util.SessionManager
import com.app.blingy.reauty.databinding.FragmentChatBinding
import com.app.blingy.reauty.feature.chat.adapter.ChatAdapter
import com.app.blingy.reauty.feature.chat.model.ChatModel
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*


@AndroidEntryPoint
class ChatFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentChatBinding? = null
    private val binding get() = _binding!!
    private lateinit var sessionManager: SessionManager


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChatBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val bottomDialog = super.onCreateDialog(savedInstanceState)
        val bottomSheet = bottomDialog.findViewById<LinearLayout>(R.id.chatSheet)
        val behavior: BottomSheetBehavior<*>

        if (bottomSheet != null) {
            behavior = BottomSheetBehavior.from(bottomSheet)
            behavior.state = BottomSheetBehavior.STATE_EXPANDED
        }
    }

    @SuppressLint("SimpleDateFormat")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sessionManager = SessionManager.getInstance(requireActivity())

        with(binding) {
            chatSheetDismiss.setOnClickListener {
                dismiss()
            }

            if (sessionManager.isFirstRun) {
                bottomOptions.visibility = View.VISIBLE
                layoutSendText.visibility = View.GONE
            } else {
                bottomOptions.visibility = View.GONE
                layoutSendText.visibility = View.VISIBLE
            }

            val chatList = arrayListOf<ChatModel>()
            val simpleDateFormat = SimpleDateFormat("HH:mm aa").format(Date())
            val chatAdapter = ChatAdapter()
            chatRecyclerView.setHasFixedSize(true)
            chatRecyclerView.adapter = chatAdapter

            sendText.setOnEditorActionListener(object : OnEditorActionListener {
                override fun onEditorAction(
                    v: TextView?,
                    actionId: Int,
                    event: KeyEvent?
                ): Boolean {
                    if (actionId == EditorInfo.IME_ACTION_SEND) {
                        val chatText = sendText.text.toString()

                        if (chatText != null) {
                            chatList.add(ChatModel(chatText, simpleDateFormat))
                            chatAdapter.setIsSend(true)
                            chatAdapter.setItemList(chatList)
                            sendText.setText("")
                        }

                        Handler().postDelayed({
                            chatList.add(ChatModel("What is your skin type?", simpleDateFormat))
                            chatAdapter.setIsSend(false)
                            chatAdapter.setItemList(chatList)
                        }, 1200)


                        val imm: InputMethodManager =
                            requireActivity().getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
                        imm.hideSoftInputFromWindow(view.windowToken, 0)

                        return true
                    }
                    return false
                }
            })


            chatList.add(ChatModel("First, let's learn about you!", simpleDateFormat))
            chatAdapter.setIsSend(false)
            chatAdapter.setItemList(chatList)

        }

    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val bottomDialog = super.onCreateDialog(savedInstanceState)
        val bottomSheet = bottomDialog.findViewById<LinearLayout>(R.id.chatSheet)
        val behavior: BottomSheetBehavior<*>
        if (bottomSheet != null) {
            behavior = BottomSheetBehavior.from(bottomSheet)
            behavior.state = BottomSheetBehavior.STATE_EXPANDED
            behavior.isDraggable = false


            behavior.addBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
                override fun onStateChanged(bottomSheet: View, newState: Int) {

                }

                override fun onSlide(bottomSheet: View, slideOffset: Float) {
                }

            })

        }

        return bottomDialog
    }


}