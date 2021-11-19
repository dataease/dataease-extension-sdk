package io.dataease.plugins.xpack.email.service;


import java.util.List;
import io.dataease.plugins.common.entity.GlobalTaskEntity;
import io.dataease.plugins.common.entity.GlobalTaskInstance;
import io.dataease.plugins.common.entity.XpackGridRequest;
import io.dataease.plugins.common.service.PluginMenuService;
import io.dataease.plugins.xpack.email.dto.request.XpackEmailTaskRequest;
import io.dataease.plugins.xpack.email.dto.response.XpackTaskGridDTO;
import io.dataease.plugins.xpack.email.dto.response.XpackTaskInstanceDTO;

public abstract class EmailXpackService extends PluginMenuService{

    public abstract int save(XpackEmailTaskRequest request);

    public abstract List<XpackTaskGridDTO> taskGrid(XpackGridRequest request);

    public abstract List<XpackTaskInstanceDTO> taskInstanceGrid(XpackGridRequest request);

    public abstract void delete(Long taskId);

    public abstract XpackEmailTaskRequest taskForm(Long taskId);

    public abstract Long saveInstance(GlobalTaskInstance instance);

    public abstract GlobalTaskInstance instanceForm(Long instanceId);

    public abstract void executeJob(GlobalTaskEntity taskEntity, GlobalTaskInstance instance);

    public abstract List<GlobalTaskEntity> allTask();
    
}
