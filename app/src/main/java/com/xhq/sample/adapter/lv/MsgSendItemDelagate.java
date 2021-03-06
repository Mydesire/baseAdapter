package com.xhq.sample.adapter.lv;

import com.xhq.adapter.abslistview.ViewHolder;
import com.xhq.adapter.abslistview.base.ItemViewDelegate;
import com.xhq.sample.R;
import com.xhq.sample.bean.ChatMessage;

/**
 * Created by zhy on 16/6/22.
 */
public class MsgSendItemDelagate implements ItemViewDelegate<ChatMessage>{

    @Override
    public int getItemViewLayoutId(){
        return R.layout.main_chat_send_msg;
    }


    @Override
    public boolean isForViewType(ChatMessage item, int position){
        return !item.isComMeg();
    }


    @Override
    public void convert(ViewHolder holder, ChatMessage chatMessage, int position){
        holder.setText(R.id.chat_send_content, chatMessage.getContent());
        holder.setText(R.id.chat_send_name, chatMessage.getName());
        holder.setImageResource(R.id.chat_send_icon, chatMessage.getIcon());
    }
}
