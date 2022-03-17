package io.dataease.plugins.common.plugin;


import java.util.Properties;

public interface DeInterceptor {

    Object intercept(DeInvocation invocation) throws Throwable;

    default Object plugin(Object target) {
        return DePlugin.wrap(target, this);
    }

    default void setProperties(Properties properties) {
        // NOP
    }
}
