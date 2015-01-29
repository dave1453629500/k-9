package com.fsck.k9.mailstore;


import com.fsck.k9.mail.MessagingException;
import com.fsck.k9.mail.internet.MimeBodyPart;
import org.openintents.openpgp.OpenPgpError;
import org.openintents.openpgp.OpenPgpSignatureResult;


public class OpenPgpResultBodyPart extends MimeBodyPart {
    private boolean wasEncrypted;
    private OpenPgpSignatureResult signatureResult;
    private OpenPgpError error;

    public OpenPgpResultBodyPart(boolean wasEncrypted) throws MessagingException {
        this.wasEncrypted = wasEncrypted;
    }

    public OpenPgpSignatureResult getSignatureResult() {
        return signatureResult;
    }

    public void setSignatureResult(OpenPgpSignatureResult signatureResult) {
        this.signatureResult = signatureResult;
    }

    public OpenPgpError getError() {
        return error;
    }

    public void setError(OpenPgpError error) {
        this.error = error;
    }

    public boolean wasEncrypted() {
        return wasEncrypted;
    }
}
