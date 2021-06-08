package com.florin.restaurant.exceptions;

import com.florin.restaurant.util.Mappings;
import com.florin.restaurant.util.ViewNames;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@Slf4j
public class ExceptionController {
    @ExceptionHandler(UserExistsException.class)
    public RedirectView handle(UserExistsException e, HttpServletRequest httpServletRequest){

       RedirectView redirectView=new RedirectView("/register");
        log.info(e.getMessage());
        FlashMap outputFlashMap= RequestContextUtils.getOutputFlashMap(httpServletRequest);
        if(outputFlashMap!=null){
            outputFlashMap.put("errorMessage",e.getMessage());
        }

        return redirectView;
    }
}

