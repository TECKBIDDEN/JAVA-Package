
package android.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Indicates a constant field value should be exported to be used in the SDK tools.
 * @hide
 */
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.SOURCE)
public @interface SdkConstant {
    public static enum SdkConstantType {
        ACTIVITY_INTENT_ACTION, BROADCAST_INTENT_ACTION, SERVICE_ACTION, INTENT_CATEGORY, FEATURE;
    }

    SdkConstantType value();
}