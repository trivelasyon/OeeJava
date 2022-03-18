package level3.reports.business.concretes;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


import level3.reports.business.abstracts.OeeReportService;
import level3.reports.core.utilities.DataResult;
import level3.reports.core.utilities.SuccessDataResult;
import level3.reports.dataAccess.abstracts.OeeDao;


@Service
public class OeeReportManager implements OeeReportService {
   	
	private OeeDao oeeDao;
	
	@Autowired
	public OeeReportManager(OeeDao oeeDao) {
		this.oeeDao=oeeDao;
	}
	

	
	@Override
	public DataResult<BigDecimal> a1AfterReworkRatio(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		
		return new SuccessDataResult<BigDecimal>(this.oeeDao.a1AfterReworkRatio(V_plant_config_num_id, p_start_date, p_stop_date));
	}

	
	@Override
	public DataResult<BigDecimal> getCalendarTime(Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.getCalendarTime(p_start_date, p_stop_date));
	}

	@Override
	public DataResult<BigDecimal> getScheduledDownTime(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.getScheduledDownTime(V_plant_config_num_id, p_start_date, p_stop_date));
	}

	@Override
	public DataResult<BigDecimal> getAvailableOperatingTime(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.getAvailableOperatingTime(V_plant_config_num_id, p_start_date, p_stop_date));
	}



	@Override
	public DataResult<List<Object>> getActualProducedTonnesDetail(int V_plant_config_num_id,Date p_start_date,Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Object>>(this.oeeDao.getActualProducedTonnesDetail(V_plant_config_num_id,p_start_date,p_stop_date));
	}


	@Override
	public DataResult<BigDecimal> getUnScheduledDownTime(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.getUnScheduledDownTime(V_plant_config_num_id, p_start_date, p_stop_date));
	}



	@Override
	public DataResult<BigDecimal> getUnScheduledDownTimeRatio(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.getUnScheduledDownTimeRatio(V_plant_config_num_id, p_start_date, p_stop_date));
	}



	@Override
	public DataResult<BigDecimal> getLineStops(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.getLineStops(V_plant_config_num_id, p_start_date, p_stop_date));
	}



	@Override
	public DataResult<BigDecimal> getNetWorkingTime(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.getNetWorkingTime(V_plant_config_num_id, p_start_date, p_stop_date));
	}



	@Override
	public DataResult<BigDecimal> getAvailableOperatingTimeRatio(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.getAvailableOperatingTimeRatio(V_plant_config_num_id, p_start_date, p_stop_date));
	}



	@Override
	public DataResult<BigDecimal> getAvailablabilityRatio(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.getAvailablabilityRatio(V_plant_config_num_id, p_start_date, p_stop_date));
	}



	@Override
	public DataResult<BigDecimal> getPlantCapacityUsageRatio(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.getPlantCapacityUsageRatio(V_plant_config_num_id, p_start_date, p_stop_date));
	}



	@Override
	public DataResult<BigDecimal> getTargetSpeedAvarage(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.getTargetSpeedAvarage(V_plant_config_num_id, p_start_date, p_stop_date));
	}



	@Override
	public DataResult<BigDecimal> getCCLSpeedPerformance(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.getCCLSpeedPerformance(V_plant_config_num_id, p_start_date, p_stop_date));
	}



	@Override
	public DataResult<BigDecimal> getActualProducedTonnes(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.getActualProducedTonnes(V_plant_config_num_id, p_start_date, p_stop_date));
	}



	@Override
	public DataResult<BigDecimal> getActualSpeed(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.getActualSpeed(V_plant_config_num_id, p_start_date, p_stop_date));
	}



	@Override
	public DataResult<BigDecimal> getSpeedPerformance(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.getSpeedPerformance(V_plant_config_num_id, p_start_date, p_stop_date));
	}



	@Override
	public DataResult<BigDecimal> finalOee(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.finalOee(V_plant_config_num_id, p_start_date, p_stop_date));
	}



	@Override
	public DataResult<BigDecimal> getMaxDemonstratedOutputRate(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<BigDecimal>(this.oeeDao.getMaxDemonstratedOutputRate(V_plant_config_num_id, p_start_date, p_stop_date));
	}



	@Override
	public DataResult<Date> getFirstDayOfCalcYearMonth(int p_year, int p_month) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Date>(this.oeeDao.getFirstDayOfCalcYearMonth(p_year, p_month));
	}



	@Override
	public DataResult<Date> getLastDayOfCalcYearMonth(int p_year, int p_month) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Date>(this.oeeDao.getLastDayOfCalcYearMonth(p_year, p_month));
	}



	@Override
	public DataResult<List<Integer>> getStoppages(int V_plant_config_num_id, Date p_start_date, Date p_stop_date,int p_stoppageType) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Integer>>(this.oeeDao.getStoppages(V_plant_config_num_id, p_start_date, p_stop_date, p_stoppageType));
	}



	@Override
	public DataResult<List<Object>> a1AfterReworkRatio_Detail(int V_plant_config_num_id, Date p_start_date, Date p_stop_date) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Object>>(this.oeeDao.a1AfterReworkRatio_Detail(V_plant_config_num_id, p_start_date, p_stop_date));
	}

	

}
