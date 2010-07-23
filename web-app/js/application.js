$(function() {
	function refreshLink() {
		var data = this.href.split(/\?/)[1];
		grailsAjax.refresh(this,data);
		return false;
	}
	
	$('.body').delegate('.list .product .colors a.color','click',refreshLink);
	
	$('.body').delegate('.prevLink, .step, .nextLink','click',refreshLink);
});
