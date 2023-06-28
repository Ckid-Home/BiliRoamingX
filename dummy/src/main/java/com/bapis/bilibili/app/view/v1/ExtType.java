package com.bapis.bilibili.app.view.v1;

import com.google.protobuf.Internal;

/* compiled from: BL */
/* loaded from: classes13.dex */
public enum ExtType implements Internal.EnumLite {
    ExtNone(0),
    ExtDataCenter(1),
    ExtDataEarnings(2),
    UNRECOGNIZED(-1);
    
    public static final int ExtDataCenter_VALUE = 1;
    public static final int ExtDataEarnings_VALUE = 2;
    public static final int ExtNone_VALUE = 0;
    private static final Internal.EnumLiteMap<ExtType> internalValueMap = new Internal.EnumLiteMap<ExtType>() { // from class: com.bapis.bilibili.app.view.v1.ExtType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public ExtType findValueByNumber(int i) {
            return ExtType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: BL */
    /* loaded from: classes13.dex */
    private static final class ExtTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new ExtTypeVerifier();

        private ExtTypeVerifier() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return ExtType.forNumber(i) != null;
        }
    }

    ExtType(int i) {
        this.value = i;
    }

    public static ExtType forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return ExtDataEarnings;
            }
            return ExtDataCenter;
        }
        return ExtNone;
    }

    public static Internal.EnumLiteMap<ExtType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return ExtTypeVerifier.INSTANCE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ExtType valueOf(int i) {
        return forNumber(i);
    }
}
