package tech.ghp.web.provider;

import org.osgi.service.component.annotations.Component;

import tech.ghp.web.api.Web;

/**
 * 
 */
@Component(name = "tech.ghp.web")
public class WebImpl implements Web{
	public String upper(String input){
		return input.toUpperCase();
	}
}
