package com.geng.service.module;

import android.support.annotation.Nullable;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gengjiarong
 * on 2018/2/11.
 *
 * 记录 各个Service 提供的接口关系
 */

public class ServiceManager {

    private static final String TAG = "ServiceManager";

    private static final Map<Class<?>, Object> serviceRegistry = new HashMap<>();

    private ServiceManager(){}

    public static void registerService(Class<?> interfaceClazz, Object obj) {
        serviceRegistry.put(interfaceClazz, obj);
    }

    public static void registerService(Class<?> interfaceClazz, Class clazz) {
        serviceRegistry.put(interfaceClazz, clazz);
    }

    @Nullable
    public static <T> T getServiceObj(Class<T> interfaceClazz) {
        if (serviceRegistry.containsKey(interfaceClazz)) {
            return (T) serviceRegistry.get(interfaceClazz);
        } else {
            Log.e(TAG, "serviceRegistry not register: "+interfaceClazz);
        }
        return null;
    }

    @Nullable
    public static Class getServiceClass(Class<?> interfaceClazz) {
        if (serviceRegistry.containsKey(interfaceClazz)) {
            return (Class) serviceRegistry.get(interfaceClazz);
        } else {
            Log.e(TAG, "serviceRegistry not register: "+interfaceClazz);
        }
        return null;
    }
}
