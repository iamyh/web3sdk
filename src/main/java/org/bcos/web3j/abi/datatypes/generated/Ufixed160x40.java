package org.bcos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.bcos.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link org.bcos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed160x40 extends Ufixed {
    public static final Ufixed160x40 DEFAULT = new Ufixed160x40(BigInteger.ZERO);

    public Ufixed160x40(BigInteger value) {
        super(160, 40, value);
    }

    public Ufixed160x40(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(160, 40, m, n);
    }
}
