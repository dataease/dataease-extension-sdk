package io.dataease.plugins.common.plugin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeInterceptorChain {

    private final List<DeInterceptor> interceptors = new ArrayList<>();

    public Object pluginAll(Object target) {
        for (DeInterceptor interceptor : interceptors) {
            target = interceptor.plugin(target);
        }
        return target;
    }

    public void addInterceptor(DeInterceptor interceptor) {
        interceptors.add(interceptor);
    }

    public List<DeInterceptor> getInterceptors() {
        return Collections.unmodifiableList(interceptors);
    }
}
