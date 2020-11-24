package com.soft1851.admin.controller;

import com.soft1851.admin.service.FriendLinkService;
import com.soft1851.api.BaseController;
import com.soft1851.api.controller.admin.FriendLinkControllerApi;
import com.soft1851.pojo.bo.SaveFriendLinkBO;
import com.soft1851.pojo.mo.FriendLinkMO;
import com.soft1851.result.GraceResult;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Date;
import java.util.Map;

/**
 * @ClassName: sdas
 * @Description: TODO
 * @Author: WangLinLIN
 * @Date: 2020/11/24 15:21:10 
 * @Version: V1.0
 **/
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class FriendLinkController extends BaseController implements FriendLinkControllerApi {
    private final FriendLinkService friendLinkService;
    @Override
    public GraceResult saveOrUpdateFriendLink(@Valid SaveFriendLinkBO saveFriendLinkBO, BindingResult result) {
        if (result.hasErrors()){
            Map<String,String> map = getErrors(result);
            return GraceResult.errorMap(map);
        }
        FriendLinkMO saveFriendLinkMO =new FriendLinkMO();
        BeanUtils.copyProperties(saveFriendLinkBO,saveFriendLinkMO);
        saveFriendLinkMO.setCreateTime(new Date());
        saveFriendLinkMO.setUpdateTime(new Date());
        friendLinkService.saveOrUpdateFriendLink(saveFriendLinkMO);
        return GraceResult.ok();
    }
}
