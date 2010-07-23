<div class="paginateButtons paginateTop">
    <g:paginate total="${productInstanceTotal}" />
</div>
<div class="list">
	<g:each in="${productIds}">
		<ajax:include controller="product" action="renderProduct" id="${it}" />
	</g:each>
</div>
<div class="paginateButtons">
    <g:paginate total="${productInstanceTotal}" />
</div>
