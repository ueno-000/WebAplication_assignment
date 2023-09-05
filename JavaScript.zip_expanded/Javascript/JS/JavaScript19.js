
function judgeNum()
{
	var input = document.querySelector('input[name="test"]:checked');
	
	if(!input)
	{
		alert("ラジオボタン未選択エラー");
	}
	else
	{
		var ans = `外れ`
		var x = Math.floor(Math.random()*3);
		
		if(x === parseInt(input.value))
		{
			ans = `当たり`;
		}
		
		alert(`${ans}\n正解：${x}`);
		
	}
		
}