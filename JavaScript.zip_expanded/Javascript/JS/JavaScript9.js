var x = Math.floor(Math.random() * 101);

function judgmentNumber(x) 
{
	if(x%2 == 0)
	{
		return "丁"
	}
	else
	{
		return "半"
	}
}



alert(`ランダムで選ばれた値：${x}\n結果：${judgmentNumber(x)}`);