package taxi.controller.driver;

import taxi.lib.Injector;
import taxi.model.Car;
import taxi.service.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/driver/cars")
public class GetMyCurrentCarsController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("taxi");
    private static final String PATH = "/WEB-INF/views/drivers/cars/all.jsp";
    private final CarService carService = (CarService) injector.getInstance(CarService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Car> cars = carService.getAllByDriver((Long)
                req.getSession().getAttribute("driver_id"));
        req.setAttribute("cars", cars);
        req.getRequestDispatcher(PATH).forward(req, resp);
    }
}
