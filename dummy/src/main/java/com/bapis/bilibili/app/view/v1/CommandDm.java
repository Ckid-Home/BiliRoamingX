package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: BL */
/* loaded from: classes13.dex */
public final class CommandDm extends GeneratedMessageLite<CommandDm, CommandDm.Builder> implements CommandDmOrBuilder {
    public static final int COMMAND_FIELD_NUMBER = 4;
    public static final int CONTENT_FIELD_NUMBER = 5;
    public static final int CTIME_FIELD_NUMBER = 7;
    private static final CommandDm DEFAULT_INSTANCE;
    public static final int EXTRA_FIELD_NUMBER = 9;
    public static final int IDSTR_FIELD_NUMBER = 10;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MID_FIELD_NUMBER = 3;
    public static final int MTIME_FIELD_NUMBER = 8;
    public static final int OID_FIELD_NUMBER = 2;
    private static volatile Parser<CommandDm> PARSER = null;
    public static final int PROGRESS_FIELD_NUMBER = 6;
    private long id_;
    private long mid_;
    private long oid_;
    private int progress_;
    private String command_ = "";
    private String content_ = "";
    private String ctime_ = "";
    private String mtime_ = "";
    private String extra_ = "";
    private String idStr_ = "";

    /* compiled from: BL */
    /* renamed from: com.bapis.bilibili.app.view.v1.CommandDm$1 */
    /* loaded from: classes13.dex */
    static /* synthetic */ class C67421 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f16716xa1df5c61;

        static {
            int[] iArr = new int[MethodToInvoke.values().length];
            f16716xa1df5c61 = iArr;
            try {
                iArr[MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16716xa1df5c61[MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16716xa1df5c61[MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16716xa1df5c61[MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16716xa1df5c61[MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16716xa1df5c61[MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16716xa1df5c61[MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    public static final class Builder extends GeneratedMessageLite.Builder<CommandDm, Builder> implements CommandDmOrBuilder {
        /* synthetic */ Builder(C67421 c67421) {
            this();
        }

        public Builder clearCommand() {
            copyOnWrite();
            ((CommandDm) this.instance).clearCommand();
            return this;
        }

        public Builder clearContent() {
            copyOnWrite();
            ((CommandDm) this.instance).clearContent();
            return this;
        }

        public Builder clearCtime() {
            copyOnWrite();
            ((CommandDm) this.instance).clearCtime();
            return this;
        }

        public Builder clearExtra() {
            copyOnWrite();
            ((CommandDm) this.instance).clearExtra();
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((CommandDm) this.instance).clearId();
            return this;
        }

        public Builder clearIdStr() {
            copyOnWrite();
            ((CommandDm) this.instance).clearIdStr();
            return this;
        }

        public Builder clearMid() {
            copyOnWrite();
            ((CommandDm) this.instance).clearMid();
            return this;
        }

        public Builder clearMtime() {
            copyOnWrite();
            ((CommandDm) this.instance).clearMtime();
            return this;
        }

        public Builder clearOid() {
            copyOnWrite();
            ((CommandDm) this.instance).clearOid();
            return this;
        }

        public Builder clearProgress() {
            copyOnWrite();
            ((CommandDm) this.instance).clearProgress();
            return this;
        }

        @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
        public String getCommand() {
            return ((CommandDm) this.instance).getCommand();
        }

        @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
        public ByteString getCommandBytes() {
            return ((CommandDm) this.instance).getCommandBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
        public String getContent() {
            return ((CommandDm) this.instance).getContent();
        }

        @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
        public ByteString getContentBytes() {
            return ((CommandDm) this.instance).getContentBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
        public String getCtime() {
            return ((CommandDm) this.instance).getCtime();
        }

        @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
        public ByteString getCtimeBytes() {
            return ((CommandDm) this.instance).getCtimeBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
        public String getExtra() {
            return ((CommandDm) this.instance).getExtra();
        }

        @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
        public ByteString getExtraBytes() {
            return ((CommandDm) this.instance).getExtraBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
        public long getId() {
            return ((CommandDm) this.instance).getId();
        }

        @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
        public String getIdStr() {
            return ((CommandDm) this.instance).getIdStr();
        }

        @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
        public ByteString getIdStrBytes() {
            return ((CommandDm) this.instance).getIdStrBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
        public long getMid() {
            return ((CommandDm) this.instance).getMid();
        }

        @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
        public String getMtime() {
            return ((CommandDm) this.instance).getMtime();
        }

        @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
        public ByteString getMtimeBytes() {
            return ((CommandDm) this.instance).getMtimeBytes();
        }

        @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
        public long getOid() {
            return ((CommandDm) this.instance).getOid();
        }

        @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
        public int getProgress() {
            return ((CommandDm) this.instance).getProgress();
        }

        public Builder setCommand(String str) {
            copyOnWrite();
            ((CommandDm) this.instance).setCommand(str);
            return this;
        }

        public Builder setCommandBytes(ByteString byteString) {
            copyOnWrite();
            ((CommandDm) this.instance).setCommandBytes(byteString);
            return this;
        }

        public Builder setContent(String str) {
            copyOnWrite();
            ((CommandDm) this.instance).setContent(str);
            return this;
        }

        public Builder setContentBytes(ByteString byteString) {
            copyOnWrite();
            ((CommandDm) this.instance).setContentBytes(byteString);
            return this;
        }

        public Builder setCtime(String str) {
            copyOnWrite();
            ((CommandDm) this.instance).setCtime(str);
            return this;
        }

        public Builder setCtimeBytes(ByteString byteString) {
            copyOnWrite();
            ((CommandDm) this.instance).setCtimeBytes(byteString);
            return this;
        }

        public Builder setExtra(String str) {
            copyOnWrite();
            ((CommandDm) this.instance).setExtra(str);
            return this;
        }

        public Builder setExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((CommandDm) this.instance).setExtraBytes(byteString);
            return this;
        }

        public Builder setId(long j) {
            copyOnWrite();
            ((CommandDm) this.instance).setId(j);
            return this;
        }

        public Builder setIdStr(String str) {
            copyOnWrite();
            ((CommandDm) this.instance).setIdStr(str);
            return this;
        }

        public Builder setIdStrBytes(ByteString byteString) {
            copyOnWrite();
            ((CommandDm) this.instance).setIdStrBytes(byteString);
            return this;
        }

        public Builder setMid(long j) {
            copyOnWrite();
            ((CommandDm) this.instance).setMid(j);
            return this;
        }

        public Builder setMtime(String str) {
            copyOnWrite();
            ((CommandDm) this.instance).setMtime(str);
            return this;
        }

        public Builder setMtimeBytes(ByteString byteString) {
            copyOnWrite();
            ((CommandDm) this.instance).setMtimeBytes(byteString);
            return this;
        }

        public Builder setOid(long j) {
            copyOnWrite();
            ((CommandDm) this.instance).setOid(j);
            return this;
        }

        public Builder setProgress(int i) {
            copyOnWrite();
            ((CommandDm) this.instance).setProgress(i);
            return this;
        }

        private Builder() {
            super(CommandDm.DEFAULT_INSTANCE);
        }
    }

    static {
        CommandDm commandDm = new CommandDm();
        DEFAULT_INSTANCE = commandDm;
        GeneratedMessageLite.registerDefaultInstance(CommandDm.class, commandDm);
    }

    private CommandDm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommand() {
        this.command_ = getDefaultInstance().getCommand();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCtime() {
        this.ctime_ = getDefaultInstance().getCtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtra() {
        this.extra_ = getDefaultInstance().getExtra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdStr() {
        this.idStr_ = getDefaultInstance().getIdStr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMid() {
        this.mid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMtime() {
        this.mtime_ = getDefaultInstance().getMtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOid() {
        this.oid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProgress() {
        this.progress_ = 0;
    }

    public static CommandDm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CommandDm parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommandDm) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommandDm parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommandDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CommandDm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommand(String str) {
        str.getClass();
        this.command_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommandBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.command_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        str.getClass();
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.content_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtime(String str) {
        str.getClass();
        this.ctime_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtimeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ctime_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtra(String str) {
        str.getClass();
        this.extra_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extra_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j) {
        this.id_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdStr(String str) {
        str.getClass();
        this.idStr_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdStrBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.idStr_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMid(long j) {
        this.mid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMtime(String str) {
        str.getClass();
        this.mtime_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMtimeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mtime_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOid(long j) {
        this.oid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProgress(int i) {
        this.progress_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C67421.f16716xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new CommandDm();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0208\u0005\u0208\u0006\u0004\u0007\u0208\b\u0208\t\u0208\n\u0208", new Object[]{"id_", "oid_", "mid_", "command_", "content_", "progress_", "ctime_", "mtime_", "extra_", "idStr_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CommandDm> parser = PARSER;
                if (parser == null) {
                    synchronized (CommandDm.class) {
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

    @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
    public String getCommand() {
        return this.command_;
    }

    @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
    public ByteString getCommandBytes() {
        return ByteString.copyFromUtf8(this.command_);
    }

    @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
    public String getContent() {
        return this.content_;
    }

    @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8(this.content_);
    }

    @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
    public String getCtime() {
        return this.ctime_;
    }

    @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
    public ByteString getCtimeBytes() {
        return ByteString.copyFromUtf8(this.ctime_);
    }

    @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
    public String getExtra() {
        return this.extra_;
    }

    @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
    public ByteString getExtraBytes() {
        return ByteString.copyFromUtf8(this.extra_);
    }

    @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
    public String getIdStr() {
        return this.idStr_;
    }

    @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
    public ByteString getIdStrBytes() {
        return ByteString.copyFromUtf8(this.idStr_);
    }

    @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
    public long getMid() {
        return this.mid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
    public String getMtime() {
        return this.mtime_;
    }

    @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
    public ByteString getMtimeBytes() {
        return ByteString.copyFromUtf8(this.mtime_);
    }

    @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
    public long getOid() {
        return this.oid_;
    }

    @Override // com.bapis.bilibili.app.view.v1.CommandDmOrBuilder
    public int getProgress() {
        return this.progress_;
    }

    public static Builder newBuilder(CommandDm commandDm) {
        return DEFAULT_INSTANCE.createBuilder(commandDm);
    }

    public static CommandDm parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommandDm) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommandDm parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommandDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CommandDm parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CommandDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CommandDm parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommandDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CommandDm parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommandDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommandDm parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommandDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CommandDm parseFrom(InputStream inputStream) throws IOException {
        return (CommandDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommandDm parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommandDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CommandDm parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommandDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CommandDm parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommandDm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
