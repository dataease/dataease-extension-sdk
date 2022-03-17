package io.dataease.plugins.common.util;


import cn.hutool.core.util.ReflectUtil;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ConstantsUtil {

    public static final String TYPE_KEY_FIELD = "NAME";

    private static final List<Class> SQLConstantsCache = new ArrayList<>();

    public static void add(Class classz) {
        SQLConstantsCache.add(classz);
    }

    public static List<Class> getAllSQLConstants() {
        return SQLConstantsCache;
    }

    public static String constantsValue(String dsType, String constantKey) {
        List<Class> allSQLConstantsClass = ConstantsUtil.getAllSQLConstants();
        Object result;

        for (int i = 0; i < allSQLConstantsClass.size(); i++) {
            Class classz = allSQLConstantsClass.get(i);
            Object fieldValue = ReflectUtil.getFieldValue(classz, ConstantsUtil.TYPE_KEY_FIELD);
            if (ObjectUtils.isNotEmpty(fieldValue) && StringUtils.equals(dsType, fieldValue.toString())) {
                result = ReflectUtil.getFieldValue(classz, constantKey);
                return ObjectUtils.isNotEmpty(result) ? result.toString() : null;
            }
        }
        return null;
    }
}
