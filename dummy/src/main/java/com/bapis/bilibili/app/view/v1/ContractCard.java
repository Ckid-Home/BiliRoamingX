package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class ContractCard extends GeneratedMessageLite<ContractCard, ContractCard.Builder> implements MessageLiteOrBuilder {
    private static final ContractCard DEFAULT_INSTANCE;
    public static final int DISPLAY_ACCURACY_FIELD_NUMBER = 2;
    public static final int DISPLAY_DURATION_FIELD_NUMBER = 3;
    public static final int DISPLAY_PROGRESS_FIELD_NUMBER = 1;
    public static final int FOLLOW_DISPLAY_END_DURATION_FIELD_NUMBER = 9;
    public static final int IS_FOLLOW_DISPLAY_FIELD_NUMBER = 7;
    public static final int IS_INTERACT_DISPLAY_FIELD_NUMBER = 11;
    public static final int IS_PLAY_DISPLAY_FIELD_NUMBER = 10;
    public static final int PAGE_TYPE_FIELD_NUMBER = 5;
    private static volatile Parser<ContractCard> PARSER = null;
    public static final int PLAY_DISPLAY_SWITCH_FIELD_NUMBER = 12;
    public static final int SHOW_MODE_FIELD_NUMBER = 4;
    public static final int TEXT_FIELD_NUMBER = 8;
    public static final int UPPER_FIELD_NUMBER = 6;
    private long displayAccuracy_;
    private long displayDuration_;
    private float displayProgress_;
    private long followDisplayEndDuration_;
    private int isFollowDisplay_;
    private int isInteractDisplay_;
    private int isPlayDisplay_;
    private int pageType_;
    private boolean playDisplaySwitch_;
    private int showMode_;
    private ContractText text_;
    private UpperInfos upper_;

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.ContractCard$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67461 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16720xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16720xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16720xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16720xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16720xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16720xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16720xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16720xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<ContractCard, Builder> implements MessageLiteOrBuilder {
        /* synthetic */ Builder(C67461 c67461) {
            this();
        }

        public Builder clearDisplayAccuracy() {
            copyOnWrite();
            ((ContractCard) this.instance).clearDisplayAccuracy();
            return this;
        }

        public Builder clearDisplayDuration() {
            copyOnWrite();
            ((ContractCard) this.instance).clearDisplayDuration();
            return this;
        }

        public Builder clearDisplayProgress() {
            copyOnWrite();
            ((ContractCard) this.instance).clearDisplayProgress();
            return this;
        }

        public Builder clearFollowDisplayEndDuration() {
            copyOnWrite();
            ((ContractCard) this.instance).clearFollowDisplayEndDuration();
            return this;
        }

        public Builder clearIsFollowDisplay() {
            copyOnWrite();
            ((ContractCard) this.instance).clearIsFollowDisplay();
            return this;
        }

        public Builder clearIsInteractDisplay() {
            copyOnWrite();
            ((ContractCard) this.instance).clearIsInteractDisplay();
            return this;
        }

        public Builder clearIsPlayDisplay() {
            copyOnWrite();
            ((ContractCard) this.instance).clearIsPlayDisplay();
            return this;
        }

        public Builder clearPageType() {
            copyOnWrite();
            ((ContractCard) this.instance).clearPageType();
            return this;
        }

        public Builder clearPlayDisplaySwitch() {
            copyOnWrite();
            ((ContractCard) this.instance).clearPlayDisplaySwitch();
            return this;
        }

        public Builder clearShowMode() {
            copyOnWrite();
            ((ContractCard) this.instance).clearShowMode();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((ContractCard) this.instance).clearText();
            return this;
        }

        public Builder clearUpper() {
            copyOnWrite();
            ((ContractCard) this.instance).clearUpper();
            return this;
        }

        public long getDisplayAccuracy() {
            return ((ContractCard) this.instance).getDisplayAccuracy();
        }

        public long getDisplayDuration() {
            return ((ContractCard) this.instance).getDisplayDuration();
        }

        public float getDisplayProgress() {
            return ((ContractCard) this.instance).getDisplayProgress();
        }

        public long getFollowDisplayEndDuration() {
            return ((ContractCard) this.instance).getFollowDisplayEndDuration();
        }

        public int getIsFollowDisplay() {
            return ((ContractCard) this.instance).getIsFollowDisplay();
        }

        public int getIsInteractDisplay() {
            return ((ContractCard) this.instance).getIsInteractDisplay();
        }

        public int getIsPlayDisplay() {
            return ((ContractCard) this.instance).getIsPlayDisplay();
        }

        public int getPageType() {
            return ((ContractCard) this.instance).getPageType();
        }

        public boolean getPlayDisplaySwitch() {
            return ((ContractCard) this.instance).getPlayDisplaySwitch();
        }

        public int getShowMode() {
            return ((ContractCard) this.instance).getShowMode();
        }

        public ContractText getText() {
            return ((ContractCard) this.instance).getText();
        }

        public UpperInfos getUpper() {
            return ((ContractCard) this.instance).getUpper();
        }

        public boolean hasText() {
            return ((ContractCard) this.instance).hasText();
        }

        public boolean hasUpper() {
            return ((ContractCard) this.instance).hasUpper();
        }

        public Builder mergeText(ContractText contractText) {
            copyOnWrite();
            ((ContractCard) this.instance).mergeText(contractText);
            return this;
        }

        public Builder mergeUpper(UpperInfos upperInfos) {
            copyOnWrite();
            ((ContractCard) this.instance).mergeUpper(upperInfos);
            return this;
        }

        public Builder setDisplayAccuracy(long j) {
            copyOnWrite();
            ((ContractCard) this.instance).setDisplayAccuracy(j);
            return this;
        }

        public Builder setDisplayDuration(long j) {
            copyOnWrite();
            ((ContractCard) this.instance).setDisplayDuration(j);
            return this;
        }

        public Builder setDisplayProgress(float f) {
            copyOnWrite();
            ((ContractCard) this.instance).setDisplayProgress(f);
            return this;
        }

        public Builder setFollowDisplayEndDuration(long j) {
            copyOnWrite();
            ((ContractCard) this.instance).setFollowDisplayEndDuration(j);
            return this;
        }

        public Builder setIsFollowDisplay(int i) {
            copyOnWrite();
            ((ContractCard) this.instance).setIsFollowDisplay(i);
            return this;
        }

        public Builder setIsInteractDisplay(int i) {
            copyOnWrite();
            ((ContractCard) this.instance).setIsInteractDisplay(i);
            return this;
        }

        public Builder setIsPlayDisplay(int i) {
            copyOnWrite();
            ((ContractCard) this.instance).setIsPlayDisplay(i);
            return this;
        }

        public Builder setPageType(int i) {
            copyOnWrite();
            ((ContractCard) this.instance).setPageType(i);
            return this;
        }

        public Builder setPlayDisplaySwitch(boolean z) {
            copyOnWrite();
            ((ContractCard) this.instance).setPlayDisplaySwitch(z);
            return this;
        }

        public Builder setShowMode(int i) {
            copyOnWrite();
            ((ContractCard) this.instance).setShowMode(i);
            return this;
        }

        public Builder setText(ContractText contractText) {
            copyOnWrite();
            ((ContractCard) this.instance).setText(contractText);
            return this;
        }

        public Builder setUpper(UpperInfos upperInfos) {
            copyOnWrite();
            ((ContractCard) this.instance).setUpper(upperInfos);
            return this;
        }

        private Builder() {
            super(ContractCard.DEFAULT_INSTANCE);
        }

        public Builder setText(ContractText.Builder builder) {
            copyOnWrite();
            ((ContractCard) this.instance).setText(builder.build());
            return this;
        }

        public Builder setUpper(UpperInfos.Builder builder) {
            copyOnWrite();
            ((ContractCard) this.instance).setUpper(builder.build());
            return this;
        }
    }

    static {
        ContractCard contractCard = new ContractCard();
        DEFAULT_INSTANCE = contractCard;
        GeneratedMessageLite.registerDefaultInstance(ContractCard.class, contractCard);
    }

    private ContractCard() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayAccuracy() {
        this.displayAccuracy_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayDuration() {
        this.displayDuration_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayProgress() {
        this.displayProgress_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFollowDisplayEndDuration() {
        this.followDisplayEndDuration_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFollowDisplay() {
        this.isFollowDisplay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInteractDisplay() {
        this.isInteractDisplay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPlayDisplay() {
        this.isPlayDisplay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageType() {
        this.pageType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlayDisplaySwitch() {
        this.playDisplaySwitch_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowMode() {
        this.showMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpper() {
        this.upper_ = null;
    }

    public static ContractCard getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeText(ContractText contractText) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpper(UpperInfos upperInfos) {
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ContractCard parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContractCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContractCard parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ContractCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ContractCard> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayAccuracy(long j) {
        this.displayAccuracy_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayDuration(long j) {
        this.displayDuration_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayProgress(float f) {
        this.displayProgress_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFollowDisplayEndDuration(long j) {
        this.followDisplayEndDuration_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFollowDisplay(int i) {
        this.isFollowDisplay_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInteractDisplay(int i) {
        this.isInteractDisplay_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPlayDisplay(int i) {
        this.isPlayDisplay_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageType(int i) {
        this.pageType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayDisplaySwitch(boolean z) {
        this.playDisplaySwitch_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowMode(int i) {
        this.showMode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(ContractText contractText) {
        contractText.getClass();
        this.text_ = contractText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpper(UpperInfos upperInfos) {
        upperInfos.getClass();
        this.upper_ = upperInfos;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67461.f16720xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new ContractCard();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0001\u0002\u0002\u0003\u0002\u0004\u0004\u0005\u0004\u0006\t\u0007\u0004\b\t\t\u0002\n\u0004\u000b\u0004\f\u0007", new Object[]{"displayProgress_", "displayAccuracy_", "displayDuration_", "showMode_", "pageType_", "upper_", "isFollowDisplay_", "text_", "followDisplayEndDuration_", "isPlayDisplay_", "isInteractDisplay_", "playDisplaySwitch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ContractCard> parser = PARSER;
                if (parser == null) {
                    synchronized (ContractCard.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public long getDisplayAccuracy() {
        return this.displayAccuracy_;
    }

    public long getDisplayDuration() {
        return this.displayDuration_;
    }

    public float getDisplayProgress() {
        return this.displayProgress_;
    }

    public long getFollowDisplayEndDuration() {
        return this.followDisplayEndDuration_;
    }

    public int getIsFollowDisplay() {
        return this.isFollowDisplay_;
    }

    public int getIsInteractDisplay() {
        return this.isInteractDisplay_;
    }

    public int getIsPlayDisplay() {
        return this.isPlayDisplay_;
    }

    public int getPageType() {
        return this.pageType_;
    }

    public boolean getPlayDisplaySwitch() {
        return this.playDisplaySwitch_;
    }

    public int getShowMode() {
        return this.showMode_;
    }

    public ContractText getText() {
        ContractText contractText = this.text_;
        return contractText == null ? ContractText.getDefaultInstance() : contractText;
    }

    public UpperInfos getUpper() {
        UpperInfos upperInfos = this.upper_;
        return upperInfos == null ? UpperInfos.getDefaultInstance() : upperInfos;
    }

    public boolean hasText() {
        return this.text_ != null;
    }

    public boolean hasUpper() {
        return this.upper_ != null;
    }

    public static Builder newBuilder(ContractCard contractCard) {
        return DEFAULT_INSTANCE.createBuilder(contractCard);
    }

    public static ContractCard parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractCard) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContractCard parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ContractCard parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContractCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ContractCard parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ContractCard parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ContractCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContractCard parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContractCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ContractCard parseFrom(InputStream inputStream) throws IOException {
        return (ContractCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContractCard parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ContractCard parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ContractCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ContractCard parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContractCard) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
