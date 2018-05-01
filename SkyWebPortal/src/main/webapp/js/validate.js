
	function check() {
        if (!validateCheckBoxes()){
            alert("Please select atleast one product");
            return false;
        }
	}
	function validateCheckBoxes() 
    {
        var isValid = false;
        var allRows = document.getElementsByTagName("input");
        for (var i=0; i < allRows.length; i++) {
            if (allRows[i].type == 'checkbox') {
                if (allRows[i].checked == true) {
                       return true;
                }
            }
        }
        return isValid;
    }
	function attachCheckboxHandlers() {
		var el = document.getElementById('checkoptions');
		var elt = el.getElementsByTagName('input');
		for (var i = 0, len = elt.length; i < len; i++) {
			if (elt[i].type === 'checkbox') {
				elt[i].onclick = updateTotal;
			}
		}
	}

	function updateTotal(e) {
		var form = this.form;
		var val = parseInt(form.elements['total'].value);
		if (this.checked) {
			val += 1;
		} else {
			val -= 1;
		}
		form.elements['total'].value = val;
	}
	attachCheckboxHandlers();
 