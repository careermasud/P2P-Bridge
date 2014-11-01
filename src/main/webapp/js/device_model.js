/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var country_arr = new Array("Polycom", "Cisco", "Lifesize", "Tandberg");

var s_a = new Array();
s_a[0]="";
s_a[1]="ATX HD 200|ATX HD 300|ATX HD 400|HDX 4000 Series|HDX 6000 Series|HDX 7000 Series|HDX 8000 Series|HDX 9000 Series|HDX Media Center|OTX HD 300|QDX 6000|RPX HD 200|RPX HD 400|TPX HD 204M|TPX HD 306M|ViewStation 128|ViewStation 512|Viewstation|Viewstation EX|Viewstation FX|Viewstation MP|VS 4000|VSX 3000|VSX 5000|VSX 6000|VSX 7000|VSX 8000|VSX 8400";
s_a[2]="CTS500|CTS1000|CTS3000|CTS3200";
s_a[3]="Conference 200|Conference|Express 200|Express 220|Express|LGExecutivet|Passport|Room 200|Room 220|Room|Team 200|Team 220|Team MP";
s_a[4]="1700 MXP|3000 MXP|6000 MXP|C20|C40|C60|C90|Edge 75 MXP|Edge 85 MXP|Edge 95 MXP|EX90";

function print_country(device){
	// given the id of the <select> tag as function argument, it inserts <option> tags
	var option_str = document.getElementById(device);
	option_str.length=0;
	option_str.options[0] = new Option('Select Device','');
	option_str.selectedIndex = 0;
	for (var i=0; i<country_arr.length; i++) {
		option_str.options[option_str.length] = new Option(country_arr[i],country_arr[i]);
	}
}
function print_state(model, state_index){
	var option_str = document.getElementById(model);
	option_str.length=0;	// Fixed by Julian Woods
	option_str.options[0] = new Option('Select Model','');
	option_str.selectedIndex = 0;
	var state_arr = s_a[state_index].split("|");
	for (var i=0; i<state_arr.length; i++) {
		option_str.options[option_str.length] = new Option(state_arr[i],state_arr[i]);
	}
}


