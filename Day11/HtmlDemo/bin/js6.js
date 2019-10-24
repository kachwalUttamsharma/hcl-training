<<<<<<< HEAD
/**
 * 
 */

function show(){
	var gen = "";
	var radios = frmradio.elements("gender");
	for(var i = 0 ; i<radios.length;i++){
		if(radios[i].checked){
			gen = radios[i].value;
		}
	}
	alert(gen);
	//document.getElementById("res").innerHTML = res;
=======
/**
 * 
 */

function show(){
	var gen = "";
	var radios = frmradio.elements("gender");
	for(var i = 0 ; i<radios.length;i++){
		if(radios[i].checked){
			gen = radios[i].value;
		}
	}
	alert(gen);
	//document.getElementById("res").innerHTML = res;
>>>>>>> aa5826ca9d0adb45959d1cbd7004f71603446a9f
}