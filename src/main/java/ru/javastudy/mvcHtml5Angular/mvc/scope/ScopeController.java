package ru.javastudy.mvcHtml5Angular.mvc.scope;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ScopeController {

    @RequestMapping(value = "/scopeSession", method = RequestMethod.GET)
    public ModelAndView scopeExample(HttpSession session) {
        System.out.println("ScopeController scopeSession() is called");
        session.setMaxInactiveInterval(3600);
        session.setAttribute("sessionObject", "Value is session object");
        return new ModelAndView("/scope/scope");
    }

    @RequestMapping(value = "/invalidateSession", method=RequestMethod.GET)
    public ModelAndView invalidateSession(HttpSession session) {
        System.out.println("ScopeController invalidate is called");
        session.invalidate();
        return new ModelAndView("/scope/scope");
    }

    @RequestMapping(value = "/scopeRequest", method=RequestMethod.GET)
    public ModelAndView requestScopeExample(HttpServletRequest request) {
        System.out.println("ScopeController requestScopeExample is called");
        request.setAttribute("requestObject", "This is request object");
        return new ModelAndView("/scope/scope");
    }

}

/*
альтернативный вариант: http://javastudy.ru/spring-mvc/save-object-in-session/
Как сохранить объект в сессии при помощи Spring MVC?
Например нам необходимо сохранять данные пользователя между запросами внутри сессии, чтобы не терять данные о сохраненных товарах в корзине.
Для этого нужно хранить объект на протяжении всей сессии пользователя в нашем приложении.
*/
