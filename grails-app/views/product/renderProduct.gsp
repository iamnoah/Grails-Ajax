<div class="product" >
	
  <g:link action="show" id="${productInstance.id}">
    <h3>
	  	${productInstance.name} 
	  	(${productInstance.id})
    </h3>
  </g:link>
  
  
  
  <span class="price">
	  ${formatNumber(number:productInstance.price,format:"\$###,##0")}
  </span>
  
  <div class="image">
  	<img src="${resource(dir:'images/product',file: productImage)}" />
  </div>
  
  <div class="description">
	  ${productInstance.description}
  </div>
  
  <div class="colors">
  	  Try different colors!
  	  <g:each in="${colors}" var="color">
	  	  <g:link class="color ${color}" action="showColor" id="${productInstance.id}" params="${[color:color]}">
	  	  	${color}
	  	  </g:link>
  	  </g:each>
  </div>

</div>