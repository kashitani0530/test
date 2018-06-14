function menseki(hankei,enshu=3.14){
	return hankei*hankei*enshu;
}

document.write(menseki(5)+"<br>");
document.write(menseki(7)+"<br>");
document.write(menseki(10)+"<br>");

function total(a1,k1,a2=500,k2=200){
	return a1 * a2 + k1 * k2 +"円です。";
}

document.write(total(2,4)+"<br>");
document.write(total(1,5)+"<br>");
document.write(total(3,7)+"<br>");