package com.xhq.sample.adapter.lv;

import android.content.Context;

import com.xhq.adapter.abslistview.MultiItemTypeAdapter;
import com.xhq.sample.bean.ChatMessage;

import java.util.List;

/**
 * Created by zhy on 15/9/4.
 */
public class ChatAdapter extends MultiItemTypeAdapter<ChatMessage>{
    public ChatAdapter(Context context, List<ChatMessage> datas){
        super(context, datas);

        addItemViewDelegate(new MsgSendItemDelagate());
        addItemViewDelegate(new MsgComingItemDelagate());
    }

}
