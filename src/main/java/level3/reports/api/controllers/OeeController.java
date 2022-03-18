package level3.reports.api.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Pair;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import level3.reports.business.abstracts.OeeReportService;
import level3.reports.core.utilities.DataResult;

@RestController
@RequestMapping("/api/oeeReports")
@CrossOrigin
public class OeeController {

	private OeeReportService oeeReportService;
	
	@Autowired
	public OeeController(OeeReportService oeeReportService) {
		this.oeeReportService=oeeReportService;
	}
	
	@GetMapping("/A1AfterReworkRatio")
	DataResult<BigDecimal> a1AfterReworkRatio(@RequestParam int V_plant_config_num_id, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date p_start_date ,@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date p_stop_date) {
		return oeeReportService.a1AfterReworkRatio( V_plant_config_num_id , p_start_date,  p_stop_date);
	}
	
	@GetMapping("/GetCalenderTime")
	DataResult<BigDecimal> getCalendarTime(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getCalendarTime(p_start_date,  p_stop_date);
	}
	
	@GetMapping("/GetScheduledDownTime")
	DataResult<BigDecimal> getScheduledDownTime(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getScheduledDownTime(V_plant_config_num_id,p_start_date,  p_stop_date);
	}
	
	@GetMapping("/GetAvailableOperatingTime")
	DataResult<BigDecimal> getAvailableOperatingTime(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getAvailableOperatingTime(V_plant_config_num_id,p_start_date,  p_stop_date);
	}
	
	@GetMapping("/GetActualProducedTonnesDetail")
	DataResult<List<Object>> getActualProducedTonnesDetail(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getActualProducedTonnesDetail(V_plant_config_num_id,p_start_date,p_stop_date);
	}
	
	@GetMapping("/GetUnScheduledDownTime")
	DataResult<BigDecimal> getUnScheduledDownTime(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getUnScheduledDownTime(V_plant_config_num_id,p_start_date,  p_stop_date);
	}
	
	@GetMapping("/GetUnScheduledDownTimeRatio")
	DataResult<BigDecimal> getUnScheduledDownTimeRatio(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getUnScheduledDownTimeRatio(V_plant_config_num_id,p_start_date,  p_stop_date);
	}
	
	@GetMapping("/GetLineStops")
	DataResult<BigDecimal> getLineStops(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getLineStops(V_plant_config_num_id,p_start_date,  p_stop_date);
	}
	
	@GetMapping("/GetAvailableOperatingTimeRatio")
	DataResult<BigDecimal> getAvailableOperatingTimeRatio(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getAvailableOperatingTimeRatio(V_plant_config_num_id,p_start_date,  p_stop_date);
	}
	
	@GetMapping("/GetAvailablabilityRatio")
	DataResult<BigDecimal> getAvailablabilityRatio(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getAvailablabilityRatio(V_plant_config_num_id,p_start_date,  p_stop_date);
	}
	
	@GetMapping("/GetPlantCapacityUsageRatio")
	DataResult<BigDecimal> getPlantCapacityUsageRatio(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getPlantCapacityUsageRatio(V_plant_config_num_id,p_start_date,  p_stop_date);
	}
	
	@GetMapping("/GetCCLSpeedPerformance")
	DataResult<BigDecimal> getCCLSpeedPerformance(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getCCLSpeedPerformance(V_plant_config_num_id,p_start_date,  p_stop_date);
	}
	
	@GetMapping("/GetActualProducedTonnes")
	DataResult<BigDecimal> getActualProducedTonnes(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getActualProducedTonnes(V_plant_config_num_id,p_start_date,  p_stop_date);
	}
	
	@GetMapping("/GetActualSpeed")
	DataResult<BigDecimal> getActualSpeed(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getActualSpeed(V_plant_config_num_id,p_start_date,  p_stop_date);
	}
	
	@GetMapping("/GetSpeedPerformance")
	DataResult<BigDecimal> getSpeedPerformance(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getSpeedPerformance(V_plant_config_num_id,p_start_date,  p_stop_date);
	}
	
	@GetMapping("/FinalOee")
	DataResult<BigDecimal> finalOee(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.finalOee(V_plant_config_num_id,p_start_date,  p_stop_date);
	}
	
	@GetMapping("/GetMaxDemonstratedOutputRate")
	DataResult<BigDecimal> getMaxDemonstratedOutputRate(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getMaxDemonstratedOutputRate(V_plant_config_num_id,p_start_date,  p_stop_date);
	}
	
	@GetMapping("/GetTargetSpeedAvarage")
	DataResult<BigDecimal> getTargetSpeedAvarage(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getTargetSpeedAvarage(V_plant_config_num_id,p_start_date,  p_stop_date);
	}
	
	@GetMapping("/GetFirstDayOfCalcYearMonth")
	DataResult<Date> getFirstDayOfCalcYearMonth(@RequestParam int p_year,@RequestParam int p_month) {
		return this.oeeReportService.getFirstDayOfCalcYearMonth(p_year,p_month);
	}
	
	@GetMapping("/GetLastDayOfCalcYearMonth")
	DataResult<Date> getLastDayOfCalcYearMonth(@RequestParam int p_year,@RequestParam int p_month) {
		return this.oeeReportService.getLastDayOfCalcYearMonth(p_year,p_month);
	}
	
	@GetMapping("/GetStoppages")
	DataResult<List<Integer>>  getStoppages(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date,@RequestParam int p_stoppageType) {
		return this.oeeReportService.getStoppages(V_plant_config_num_id,p_start_date,  p_stop_date ,p_stoppageType);
	}
	
	@GetMapping("/A1AfterReworkRatio_Detail")
	DataResult<List<Object>>  a1AfterReworkRatio_Detail(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.a1AfterReworkRatio_Detail(V_plant_config_num_id,p_start_date,  p_stop_date );
		
	}
	
	@GetMapping("/GetNetWorkingTime")
	DataResult<BigDecimal> getNetWorkingTime(@RequestParam int V_plant_config_num_id,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_start_date ,@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date p_stop_date) {
		return this.oeeReportService.getNetWorkingTime(V_plant_config_num_id,p_start_date, p_stop_date );
		
	}
}

