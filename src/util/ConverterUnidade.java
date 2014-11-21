package util;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import teste_JSFII.Unidade;

public class ConverterUnidade implements Converter{
	
	List<Unidade> unidades;
	
	public ConverterUnidade(){	
	}
	
	public ConverterUnidade(List<Unidade> unidades){
		this.unidades = unidades;
	}
	
	public List<Unidade> getUnidades() {
		return unidades;
	}

	public void setUnidades(List<Unidade> unidades) {
		this.unidades = unidades;
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String descricao) {
		Unidade unidade = null;
		for(Unidade u: unidades){
			if(u.getDescricao().equals(descricao)){
				unidade = u;
			}
		}
		return unidade;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		return null;
	}

}
