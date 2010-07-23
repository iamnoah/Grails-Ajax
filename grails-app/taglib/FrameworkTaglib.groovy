import org.codehaus.groovy.grails.web.metaclass.ControllerDynamicMethods;
import org.codehaus.groovy.grails.web.servlet.GrailsApplicationAttributes;

import groovy.xml.MarkupBuilder;

class FrameworkTagLib {
    
    // this is a terrible choice for a namespace as it ought to be popular
    static namespace = "ajax"

    /**
     * Limitations over g:include - Can only include other controller actions. 
     * id is supported but not view, params or model, so messing with state 
     * become difficult. Need some sort of named mapping to a model (and maybe params).
     * 
     * Also, wrapping everything in a div is another form of limitation, but 
     * shouldn't cause many problems and should be workable.
     */
    def include = { attrs ->
        def controller = attrs.controller, action = attrs.action, id = attrs.id
        // it's possible that there would be duplicate ids, but in that case they should render the exact same thing
        def component = "${controller}-${action}" + (id ? "-${id}" : "")
        
		out << """<div id="${component}" class="ajax-component">"""
		out << g.include(attrs)
		out << "</div>"
    }
}
