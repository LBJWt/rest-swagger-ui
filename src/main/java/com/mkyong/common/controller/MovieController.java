package com.mkyong.common.controller;

import com.mkyong.common.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/movie")
public class MovieController {

	@RequestMapping(value="/{name}", method = RequestMethod.GET)
    @ResponseBody
	public Movie getMovie(@PathVariable String name) {
        Movie movie=new Movie();
        movie.name=name;
        movie.year="1985";
		return movie;

	}

}
