function totalValueCalculation()
{
	var inputs = document.getElementsByClassName('input-value');
	var total = 0;
  
	for (var i = 0; i < inputs.length; i++) 
	{
    	var value = parseFloat(inputs[i].value);
    	
    	if (!isNaN(value)) 
    	{
      		total += value;
    	}
  }
  
  alert(`合計：${total}`);
	
}