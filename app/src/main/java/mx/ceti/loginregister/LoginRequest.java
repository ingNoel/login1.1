package mx.ceti.loginregister;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Cruzamor on 06/10/2016.
 */
public class LoginRequest extends StringRequest {
    private static final String LOGIN_REQUEST_URL =  "http://baneralog.esy.es/Login.php";
    private Map<String,String> params;
    //Constructor
    public  LoginRequest ( String username, String password, Response.Listener<String> listener){
        super (Request.Method.POST, LOGIN_REQUEST_URL,listener, null);//POST: enviar datos a Register.php.
        params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
