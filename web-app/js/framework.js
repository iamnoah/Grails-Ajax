(function() {
	window.grailsAjax = {
		refresh: function(target,params,cb) {
			var component = $(target).parents('.ajax-component:first');
			
			if(!component.length) throw "Error: target does not belong to an ajax component"
			
			// limitation: assume default mapping scheme - a more robust 
			// solution would register the values of reverse URL mappings
			var path = '/'+component.attr('id').replace('-','/');
			
			component.load(path,params,cb);
		}
	};
})();
