package level3.reports.dataAccess.abstracts;


import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.Tuple;

import org.hibernate.Session;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.result.Output;
import org.hibernate.result.ResultSetOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Repository;

import ch.qos.logback.classic.Logger;




@Repository
public class OeeDao  {
	
	
	@Autowired
	private EntityManager entitymanager;
	
	
	
	public BigDecimal a1AfterReworkRatio(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
	
	
		
		BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_A1AfterReworkRatio(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
   
   
	}
	
	public BigDecimal getCalendarTime(Date p_start_date,Date p_stop_date) {
		
		BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetCalendarTime(:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
   
	}
	
	public BigDecimal getScheduledDownTime(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
		
		BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetScheduledDownTime(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
   
	}
	
    public BigDecimal getAvailableOperatingTime(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
		
		BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetAvailableOperatingTime(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
   
	}
	
	public BigDecimal getUnScheduledDownTime(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
		
		BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetUnScheduledDownTime(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
   
	}
	
	public BigDecimal getUnScheduledDownTimeRatio(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
		
		BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetUnScheduledDownTimeRatio(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
   
	}
	
    public BigDecimal getLineStops(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
		
		BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetLineStops(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
   
	}
	
    public BigDecimal getNetWorkingTime(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
		
		BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetNetWorkingTime(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
   
	}
	
    public BigDecimal getAvailableOperatingTimeRatio(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
		
		BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetAvailableOperatingTimeRatio(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
   
	}
	
    public BigDecimal getAvailablabilityRatio(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
		
		BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetAvailablabilityRatio(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
   
	}

    public BigDecimal getPlantCapacityUsageRatio(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
		
		BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetPlantCapacityUsageRatio(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
   
	}
	
    public BigDecimal getTargetSpeedAvarage(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
		
		BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetTargetSpeedAvarage(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
   
	}
	
    public BigDecimal getCCLSpeedPerformance(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
		
		BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetCCLSpeedPerformance(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
   
	}
	
    public BigDecimal getActualProducedTonnes(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
		
		BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetActualProducedTonnes(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
   
	}
    
    public List<Object> getActualProducedTonnesDetail(int V_plant_config_num_id,Date p_start_date,Date p_stop_date)
    {

    	StoredProcedureQuery query = entitymanager.createStoredProcedureQuery("Z_PKG_OEE_NEW.Z_OEE_GetActualProducedTonnes_Detail1");
    	
    	System.out.println("v_plant : " + V_plant_config_num_id);
    	
    	query.registerStoredProcedureParameter(1,Integer.class,ParameterMode.IN);
    	query.registerStoredProcedureParameter(2,Date.class,ParameterMode.IN);
    	query.registerStoredProcedureParameter(3,Date.class,ParameterMode.IN);
    	query.registerStoredProcedureParameter(4,void.class,ParameterMode.REF_CURSOR);
        query.setParameter(1, V_plant_config_num_id);
        query.setParameter(2, p_start_date);
        query.setParameter(3, p_stop_date);

    	query.execute();
    			

		@SuppressWarnings("unchecked")
		List<Object> obj =(List<Object>)query.getResultList();
                
        return obj;
        
    }
    
    public List<Integer> getStoppages(int V_plant_config_num_id,Date p_start_date,Date p_stop_date,int p_stoppageType)
    {

    	StoredProcedureQuery query = entitymanager.createStoredProcedureQuery("Z_PKG_OEE_NEW.Z_OEE_GetStoppages");
    	   	
    	query.registerStoredProcedureParameter(1,Integer.class,ParameterMode.IN);
    	query.registerStoredProcedureParameter(2,Date.class,ParameterMode.IN);
    	query.registerStoredProcedureParameter(3,Date.class,ParameterMode.IN);
    	query.registerStoredProcedureParameter(4,Integer.class,ParameterMode.IN);
    	query.registerStoredProcedureParameter(5,Integer.class,ParameterMode.OUT);
    	query.registerStoredProcedureParameter(6,Integer.class,ParameterMode.OUT);
        query.setParameter(1, V_plant_config_num_id);
        query.setParameter(2, p_start_date);
        query.setParameter(3, p_stop_date);
        query.setParameter(4, p_stoppageType);
    	query.execute();
    	
    	Integer stopDuration = (Integer) query.getOutputParameterValue(5);
    	Integer stopCount = (Integer) query.getOutputParameterValue(6);

    	List<Integer> stopList=new ArrayList<Integer>();
    	
    	stopList.add(stopCount);
    	stopList.add(stopDuration);
    	
        return stopList;
        
    }
    
    public List<Object> a1AfterReworkRatio_Detail(int V_plant_config_num_id,Date p_start_date,Date p_stop_date)
    {

    	StoredProcedureQuery query = entitymanager.createStoredProcedureQuery("Z_PKG_OEE_NEW.Z_OEE_A1AfterReworkRatio_Detail1");
    	
    	
    	query.registerStoredProcedureParameter(1,Integer.class,ParameterMode.IN);
    	query.registerStoredProcedureParameter(2,Date.class,ParameterMode.IN);
    	query.registerStoredProcedureParameter(3,Date.class,ParameterMode.IN);
    	query.registerStoredProcedureParameter(4,void.class,ParameterMode.REF_CURSOR);
        query.setParameter(1, V_plant_config_num_id);
        query.setParameter(2, p_start_date);
        query.setParameter(3, p_stop_date);

    	query.execute();
    
    	List<Object> detail = (List<Object>) query.getResultList();
         
    	
        return detail;
        
    }
    
    
    public BigDecimal getActualSpeed(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
    	
    	BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetActualSpeed(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
	
    }
    
    public BigDecimal getSpeedPerformance(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
    	
    	BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetSpeedPerformance(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
	
    }
    
    public BigDecimal finalOee(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
    	
    	BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_FINAL_OEE(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
	
    }

    public BigDecimal getMaxDemonstratedOutputRate(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {

    	
		BigDecimal commentCount = (BigDecimal) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetMaxDemonstratedOutputRate(:V_plant_config_num_id,:p_start_date,:p_stop_date) FROM DUAL"
			    )
			    .setParameter("V_plant_config_num_id", V_plant_config_num_id).setParameter("p_start_date", p_start_date).setParameter("p_stop_date", p_stop_date)
			    .getSingleResult();
          return commentCount;
   
	}
    
    public Date getFirstDayOfCalcYearMonth(int p_year , int p_month) {
    	
		Date commentCount = (Date) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetFirstDayOfCalcYearMonth(:p_year,:p_month) FROM DUAL"
			    )
			    .setParameter("p_year", p_year).setParameter("p_month", p_month)
			    .getSingleResult();
          return commentCount;
    }
    
    public Date getLastDayOfCalcYearMonth(int p_year , int p_month) {
    	
		Date commentCount = (Date) entitymanager
			    .createNativeQuery(
			        "SELECT Z_PKG_OEE_NEW.Z_OEE_GetLastDayOfCalcYearMonth(:p_year,:p_month) FROM DUAL"
			    )
			    .setParameter("p_year", p_year).setParameter("p_month", p_month)
			    .getSingleResult();
		return commentCount;
   }
  
}
