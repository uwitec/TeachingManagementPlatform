package com.ruicai.system.controller;

import com.alibaba.fastjson.JSON;
import com.ruicai.system.po.system.SystemDictionary;
import com.ruicai.system.po.system.SystemDictionaryType;
import com.ruicai.system.service.DictionaryService;
import com.ruicai.system.service.DictionaryTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 数据字典控制器
 *
 * Created by XuMing on 2017/4/5.
 */
@SuppressWarnings("SameReturnValue")
@Controller
public class DictionaryController {

    private final DictionaryTypeService typeService;

    private final DictionaryService dictionaryService;

    @Autowired
    public DictionaryController(DictionaryTypeService typeService, DictionaryService dictionaryService) {
        this.typeService = typeService;
        this.dictionaryService = dictionaryService;
    }

    @RequestMapping(value = "/dictionary", method = RequestMethod.GET)
    public String dictionary() {
        return "dictionary";
    }

    @ResponseBody
    @RequestMapping(value = "/getDictionaryTypes", method = RequestMethod.POST)
    public String getDictionaryTypes() {
        return JSON.toJSONString(typeService.getDictionaryTypes());
    }

    @ResponseBody
    @RequestMapping(value = "/getDictionaryTypeById", method = RequestMethod.POST)
    public String getDictionaryTypeById(String id) {
        return JSON.toJSONString(typeService.getDictionaryTypeById(id));
    }

    @ResponseBody
    @RequestMapping(value = "/addDictionaryType", method = RequestMethod.POST)
    public String addDictionaryType(SystemDictionaryType dictionaryType) {
        typeService.addDictionaryType(dictionaryType);
        return "添加字典类型成功";
    }


    @ResponseBody
    @RequestMapping(value = "/editDictionaryType", method = RequestMethod.POST)
    public String editDictionaryType(SystemDictionaryType dictionaryType) {
        typeService.editDictionaryType(dictionaryType);
        return "修改字典类型成功";
    }

    @ResponseBody
    @RequestMapping(value = "/deleteDictionaryType", method = RequestMethod.POST)
    public String deleteDictionaryType(String id) {
        typeService.deleteDictionaryType(id);
        return "删除字典类型成功";
    }


    @ResponseBody
    @RequestMapping(value = "/getDictionaryById", method = RequestMethod.POST)
    public String getDictionaryById(String id) {
        return JSON.toJSONString(dictionaryService.getDictionaryById(id));
    }

    @ResponseBody
    @RequestMapping(value = "/getDictionaries", method = RequestMethod.POST)
    public String getDictionaries(String type, String name, String value, String describe) {
        return JSON.toJSONString(dictionaryService.getDictionaries(type, name, value, describe));
    }

    @ResponseBody
    @RequestMapping(value = "/addDictionary", method = RequestMethod.POST)
    public String addDictionary(SystemDictionary dictionary) {
        dictionaryService.addDictionary(dictionary);
        return "添加数据字典成功";
    }

    @ResponseBody
    @RequestMapping(value = "/editDictionary", method = RequestMethod.POST)
    public String editDictionary(SystemDictionary dictionary) {
        dictionaryService.editDictionary(dictionary);
        return "修改数据字典成功";
    }

    @ResponseBody
    @RequestMapping(value = "/deleteDictionaries", method = RequestMethod.POST)
    public String deleteDictionaries(String data) {
        List<SystemDictionary> dictionaries = JSON.parseArray(data, SystemDictionary.class);
        dictionaryService.deleteDictionaries(dictionaries);
        return "删除数据字典成功";
    }
}
