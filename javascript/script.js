for(var star=1; star<=5; star++){
	document.write("★");
}

for(var star=1; star<=2; star++){
    document.write("<br>");
    document.write("★★★");
}

for(var star1=1; star1<3; star1++){
	document.write("<br>");
	for(var star2=1; star2<5; star2++){
		document.write("☆");
	}
	document.write("☆");
}

for(var star1=1; star1<5; star1++){
	document.write("<br>");
	for(var star2=1; star2<5; star2++){
		document.write("★");
	}
	document.write("★");
}

for(var star1=1; star1<5; star1++){
	document.write("<br>");
	for(var star2=1; star2<3; star2++){
		document.write("★");
	}
	document.write("★");
}

for(var star1=1; star1<4; star1++){
	document.write("<br>");
	for(var star2=1; star2<3; star2++){
		if(star2%2==0){
			document.write("☆");
		}else{
			document.write("★");
		}
	}
	document.write("★");
}

for(var star1=1; star1<5; star1++){
	document.write("<br>");
	for(var star2=1; star2<5; star2++){
		if(star2%2==0){
			document.write("☆");
		}else{
			document.write("★");
		}
	}
	document.write("★");
}


for(var star1=1; star1<7; star1++){
	document.write("<br>");
	for(var star2=1; star2<star1; star2++){
		document.write("★");
		}
	}
