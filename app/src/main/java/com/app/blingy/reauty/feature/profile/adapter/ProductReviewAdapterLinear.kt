package com.app.blingy.reauty.feature.profile.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.app.blingy.reauty.core.domain.model.post.Post
import com.app.blingy.reauty.core.util.extension.setAvatarResString
import com.app.blingy.reauty.core.util.extension.setImageResString
import com.app.blingy.reauty.databinding.ItemReviewLinearBinding
import com.app.blingy.reauty.feature.profile.adapter.ProductReviewAdapterLinear.LinearViewViewHolder
import com.app.blingy.reauty.feature.profile.model.UiModelPost

private val differCallback = object : DiffUtil.ItemCallback<UiModelPost>(){
    override fun areItemsTheSame(oldItem: UiModelPost, newItem: UiModelPost): Boolean {
        return  oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: UiModelPost, newItem: UiModelPost): Boolean {
        return oldItem.hashCode() === newItem.hashCode()
    }

}
class ProductReviewAdapterLinear(private val onItemFeedClickListener: OnItemPostsClickListener): ListAdapter<UiModelPost,LinearViewViewHolder>(differCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):LinearViewViewHolder {
        val binding = ItemReviewLinearBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return LinearViewViewHolder(binding, onItemFeedClickListener)
    }

    override fun onBindViewHolder(holder: LinearViewViewHolder, position: Int) {
        val currentItem: UiModelPost = getItem(position)
        holder.bind(currentItem)
    }


    inner class LinearViewViewHolder(
        private val binding:  ItemReviewLinearBinding,
        private val onClickListener: OnItemPostsClickListener
    ) : RecyclerView.ViewHolder(binding.root) {

        private fun clickListeners() {
            val position = bindingAdapterPosition
            if (position != RecyclerView.NO_POSITION) {
                binding.apply {
                    root.setOnClickListener {
                        onClickListener.onItemViewClickedPost(position)
                    }
                    imvLikeSocialFeed.setOnClickListener {
                        onClickListener.onLikeClicked(position)
                    }
                    imvCommentSocialFeed.setOnClickListener {
                        onClickListener.onCommentClicked(position)
                    }
                    imvShareSocialFeed.setOnClickListener {
                        onClickListener.onShareClicked(position)
                    }
                }
            }
        }


        private fun setImages(items: UiModelPost) {
            binding.apply {
                val position = bindingAdapterPosition
                root.setOnClickListener {
                    onClickListener.onItemViewClickedPost(
                        position
                    )
                }
                itemProductImgReview.setImageResString(items.postImageLink)
            }

        }
        private fun setPostOwnerAvatar(item: UiModelPost) {
            binding.apply {
                // to show the user avatar is image url is not empty
                if (item.userProfileImage.isNotEmpty()) {
                    userProfImage.setImageResString(item.userProfileImage)
                }
            }
        }

        private fun setUserDetails(items: UiModelPost){
            binding.apply {
//                if (items.userProfileImage.isNotEmpty()){

//                }
                userProfImage.setAvatarResString(items.userProfileImage)
                username.text = items.postOwnerName
            }
        }

        fun bind(item: UiModelPost) {
            binding.apply {
                with(item) {
                    setImages(this)
                    setUserDetails(this)
                    clickListeners()
                }
            }
        }

    }


    override fun getItemCount() = currentList.size

}