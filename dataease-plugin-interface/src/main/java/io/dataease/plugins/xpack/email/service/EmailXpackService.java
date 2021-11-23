package io.dataease.plugins.xpack.email.service;


import java.util.List;
import io.dataease.plugins.common.entity.GlobalTaskEntity;
import io.dataease.plugins.common.entity.GlobalTaskInstance;
import io.dataease.plugins.common.entity.XpackGridRequest;
import io.dataease.plugins.common.service.PluginMenuService;
import io.dataease.plugins.xpack.email.dto.request.XpackEmailTaskRequest;
import io.dataease.plugins.xpack.email.dto.request.XpackPixelEntity;
import io.dataease.plugins.xpack.email.dto.response.XpackEmailTemplateDTO;
import io.dataease.plugins.xpack.email.dto.response.XpackTaskGridDTO;
import io.dataease.plugins.xpack.email.dto.response.XpackTaskInstanceDTO;

public abstract class EmailXpackService extends PluginMenuService{

    public abstract int save(XpackEmailTaskRequest request) throws Exception;

    public abstract List<XpackTaskGridDTO> taskGrid(XpackGridRequest request);

    public abstract List<XpackTaskInstanceDTO> taskInstanceGrid(XpackGridRequest request) ;

    public abstract void delete(Long taskId) throws Exception;

    public abstract XpackEmailTaskRequest taskForm(Long taskId);

    public abstract Long saveInstance(GlobalTaskInstance instance);

    public abstract GlobalTaskInstance instanceForm(Long instanceId);

    public abstract String print( String url, String token, XpackPixelEntity XpackPixelEntity) throws Exception;

    public abstract List<GlobalTaskEntity> allTask();

    public abstract XpackEmailTemplateDTO emailTemplate(Long taskId);

    public abstract byte[] printData(String url, String token, XpackPixelEntity XpackPixelEntity) throws Exception;
    
}
