package com.xhq.sample.adapter.rv;

import com.xhq.adapter.recyclerview.base.ItemViewDelegate;
import com.xhq.adapter.recyclerview.base.ViewHolder;
import com.xhq.sample.R;
import com.xhq.sample.bean.ChatMessage;

/**
 * Created by zhy on 16/6/22.
 */
public class MsgComingItemDelagate implements ItemViewDelegate<ChatMessage>{

    @Override
    public int getItemViewLayoutId(){
        return R.layout.main_chat_from_msg;
    }


    @Override
    public boolean isForViewType(ChatMessage item, int position){
        return item.isComMeg();
    }


    @Override
    public void convert(ViewHolder holder, ChatMessage chatMessage, int position){
        holder.setText(R.id.chat_from_content, chatMessage.getContent());
        holder.setText(R.id.chat_from_name, chatMessage.getName());
        holder.setImageResource(R.id.chat_from_icon, chatMessage.getIcon());
    }
}
