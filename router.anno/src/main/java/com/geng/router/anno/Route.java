package com.geng.router.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Created by gengjiarong
 * on 2018/2/23.
 */

@Retention(CLASS)
@Target(TYPE)
public @interface Route {
    String path() default "";
}


