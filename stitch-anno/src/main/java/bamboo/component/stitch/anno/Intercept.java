package bamboo.component.stitch.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by tangshuai on 2018/3/27.
 */

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface Intercept {
}
