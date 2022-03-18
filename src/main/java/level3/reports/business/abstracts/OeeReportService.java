package level3.reports.business.abstracts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.util.Pair;

import level3.reports.core.utilities.DataResult;

public interface OeeReportService {
	
	DataResult<BigDecimal> a1AfterReworkRatio(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
    
	DataResult<BigDecimal> getCalendarTime(Date p_start_date,Date p_stop_date);
	
	DataResult<BigDecimal> getScheduledDownTime(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
	
	DataResult<BigDecimal> getAvailableOperatingTime(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
	
	DataResult<List<Object>> getActualProducedTonnesDetail(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
    
    DataResult<BigDecimal> getUnScheduledDownTime(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
    
    DataResult<BigDecimal> getUnScheduledDownTimeRatio(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
    
    DataResult<BigDecimal> getLineStops(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
    
    DataResult<BigDecimal> getNetWorkingTime(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
    
    DataResult<BigDecimal> getAvailableOperatingTimeRatio(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
    
    DataResult<BigDecimal> getAvailablabilityRatio(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
    
    DataResult<BigDecimal> getPlantCapacityUsageRatio(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
    
    DataResult<BigDecimal> getTargetSpeedAvarage(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
    
    DataResult<BigDecimal> getCCLSpeedPerformance(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
    
    DataResult<BigDecimal> getActualProducedTonnes(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
    
    DataResult<BigDecimal> getActualSpeed(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
    
    DataResult<BigDecimal> getSpeedPerformance(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
    
    DataResult<BigDecimal> finalOee(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
    
    DataResult<BigDecimal> getMaxDemonstratedOutputRate(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
    
    DataResult<Date> getFirstDayOfCalcYearMonth(int p_year , int p_month);
    
    DataResult<Date> getLastDayOfCalcYearMonth(int p_year , int p_month);
    
    DataResult<List<Integer>>getStoppages(int V_plant_config_num_id,Date p_start_date,Date p_stop_date,int p_stoppageType);
    
    DataResult<List<Object>> a1AfterReworkRatio_Detail(int V_plant_config_num_id,Date p_start_date,Date p_stop_date);
}
