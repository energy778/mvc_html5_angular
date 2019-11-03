package ru.javastudy.mvcHtml5Angular.mvc.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * В Spring MVC достаточно реализовать интерфейс HandlerExceptionResolver для перехвата исключений и их обработки по своему усмотрению
 * */
@Component
public class ExceptionHandler implements HandlerExceptionResolver {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println("Spring MVC ExceptionHandler handling");
        logger.error("ErrorLog: ", ex);
        return new ModelAndView("/error/exception", "exceptionMsg", "ExceptionHandler msg: " + ex.toString());
    }

}
