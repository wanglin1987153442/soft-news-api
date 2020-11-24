package com.soft1851.api.controller.article;

import com.soft1851.pojo.bo.NewArticleBO;
import com.soft1851.result.GraceResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @ClassName: asd @Description: TODO @Author: WangLinLIN @Date: 2020/11/24 19:20:57  @Version: V1.0
 */
@Api(
    value = "文章业务的controller",
    tags = {"文章业务的controller"})
@RequestMapping("article")
public interface ArticleControllerApi {
  /**
   * 用户发文章
   *
   * @param newArticleBO
   * @param result
   * @return
   */
  @ApiOperation(value = "用户发文", notes = "用户发文", httpMethod = "POST")
  @PostMapping("createArticle")
  GraceResult createArticle(@RequestBody @Valid NewArticleBO newArticleBO, BindingResult result);
    }