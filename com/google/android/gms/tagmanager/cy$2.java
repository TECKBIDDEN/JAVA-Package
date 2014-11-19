package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

class cy$2
  implements Handler.Callback
{
  public boolean handleMessage(Message paramMessage)
  {
    if ((1 == paramMessage.what) && (cy.ef().equals(paramMessage.obj)))
    {
      this.arq.dispatch();
      if ((cy.b(this.arq) > 0) && (!cy.c(this.arq)))
        cy.d(this.arq).sendMessageDelayed(cy.d(this.arq).obtainMessage(1, cy.ef()), cy.b(this.arq));
    }
    return true;
  }
}

/* Location:           C:\Users\Lino\java\2014\APKtoJava_RC2\tools\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.cy.2
 * JD-Core Version:    0.6.0
 */