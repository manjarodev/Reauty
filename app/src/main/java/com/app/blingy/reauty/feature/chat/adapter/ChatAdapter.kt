package com.app.blingy.reauty.feature.chat.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.blingy.reauty.R
import com.app.blingy.reauty.feature.chat.model.ChatModel

class ChatAdapter : RecyclerView.Adapter<ChatAdapter.ViewHolder>() {

    private var itemList = arrayListOf<ChatModel>()
    private var isSend: Boolean = false

    fun setIsSend(_isSend: Boolean) {
        isSend = _isSend
    }

    fun setItemList(_chatList: List<ChatModel>) {
        itemList = _chatList as ArrayList<ChatModel>
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view: View? = null

        if (isSend) {
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_chat_send, parent, false)
        } else {
            view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_chat_receive, parent, false)
        }
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val chatModel = itemList[position]

        holder.chatText.text = chatModel.chatText
        holder.chatDate.text = chatModel.chatDate

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val chatText: TextView = itemView.findViewById(R.id.chatText)
        val chatDate: TextView = itemView.findViewById(R.id.chatDate)
    }


}