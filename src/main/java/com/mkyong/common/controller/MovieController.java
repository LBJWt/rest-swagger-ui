package com.mkyong.common.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/movie")
public class MovieController {

//	@RequestMapping(value="/{name}", method = RequestMethod.GET)
//	public String getMovie(@PathVariable String name, ModelMap model) {
//		model.addAttribute("movie", name);
//		return "list";
//	}
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String getJSON(@PathVariable String id, ModelMap model) {
		model.addAttribute("movie", id);
		List list=new ArrayList();
		list.add("qqq");
		list.add("qqq");
		list.add("qqq");
		ObjectMapper mapper=new ObjectMapper();
		try {
			System.out.println(mapper.writeValueAsString(list));
			return mapper.writeValueAsString(list);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	@RequestMapping(value="/userres/{name}", method = RequestMethod.PUT)
	@ResponseBody
	public String putJSON(@PathVariable String name, ModelMap model) {
		model.addAttribute("movie", name);
		List list=new ArrayList();
		list.add("qqq");
		list.add("qqq");
		list.add(name);
		ObjectMapper mapper=new ObjectMapper();
		try {
			System.out.println(mapper.writeValueAsString(list));
			return mapper.writeValueAsString(list);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	@RequestMapping(value="/userSave", method = RequestMethod.POST)
	@ResponseBody
	public String post(String name, String age, ModelMap model) {
		model.addAttribute("movie", name);
		List list=new ArrayList();
		list.add("qqq");
		list.add("qqq");
		list.add(name);
		ObjectMapper mapper=new ObjectMapper();
		try {
			System.out.println(mapper.writeValueAsString(list));
			return mapper.writeValueAsString(list);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}