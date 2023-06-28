package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* compiled from: BL */
/* loaded from: classes13.dex */
public interface FeedViewItemOrBuilder extends MessageLiteOrBuilder {
    String getGoto();

    ByteString getGotoBytes();

    String getTrackId();

    ByteString getTrackIdBytes();

    String getUri();

    ByteString getUriBytes();

    ViewReply getView();

    boolean hasView();
}
