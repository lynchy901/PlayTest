package controllers;

import models.Club;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;

import javax.inject.Inject;

import static play.mvc.Results.ok;

/**
 * Created by nathan on 4/18/17.
 */
public class TestController extends Controller {
    private final FormFactory formFactory;

    @Inject
    public TestController(final FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result test() {
        Form<Club> userForm = formFactory.form(Club.class);

        Club club = userForm.bindFromRequest().get();

        System.out.println(club.getClubName());

        return ok();
    }
}
