package capsule;

import java.util.HashMap;
import java.util.Map;

public class Time {
	private boolean am;
	private Integer twentyfourHour;
	private Integer twelveHour;
	private Integer minute;
	private Integer second;
	private Map<Object, Object> time;

	public Time(Integer hour, Integer minute, Integer second) {
		this.setTwentyfourHour(hour);
		this.setTwelvehour(hour);
		this.setMinute(minute);
		this.setSecond(second);
		this.setTime(hour, minute, second);
	}

	public void setTime(Integer hour, Integer minute, Integer second) {
		this.time = new HashMap<Object, Object>();
		time.put("TwentyfourHour", this.getTwentyfourHour());
		time.put("twelveHour", this.getTwelvehour());
		time.put("minute", this.getMinute());
		time.put("second", this.getSecond());
		time.put("am", this.valueOfAm(this.am));
	}

	public String valueOfAm(boolean am) {
		return this.isAm() ? "AM" : "PM";
	}

	public void setTwelvehour(Integer hour) {
		if ((isValidNumber(hour, ">=", 0) == true && isValidNumber(hour, "<=", 23) == true)) {
			if (hour <= 12) {
				this.twelveHour = hour;
				setAm(true);
			} else {
				this.twelveHour = hour % 12;
				setAm(false);
			}
		}
	}

	public Integer getTwelvehour() {
		return this.twelveHour;
	}

	public Object getTime() {
		return this.time;
	}

	public Object getKey(Object value) {
		try {
			if (this.time.containsValue(value)) {
				for (Map.Entry<Object, Object> map : this.time.entrySet()) {
					if (value == map.getValue()) {
						return map.getKey();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		return null;
	}

	public Object getValue(Object key) {
		try {
			if (isNull(key) != true) {
				return this.time.get(key);
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
		}
		return null;
	}


	public void setAm(boolean am) {
		this.am = am;
	}

	public Integer getMinute() {
		return this.minute;
	}

	public void setMinute(Integer minute) {
		try {
			if ((isValidNumber(minute, ">=", 0) == true && isValidNumber(minute, "<=", 59) == true)) {
				this.minute = minute;
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public Integer getSecond() {
		return this.second;
	}

	public boolean isNull(Object obj) {
		return (obj == null) ? true : false;
	}

	public boolean isValidNumber(Integer number, Integer isValid) {
		if (isNull(number) == true || isNull(isValid)) {
			throw new NullPointerException();
		}
		return (number == isValid) ? true : false;
	}

	public boolean isValidNumber(Integer number, String operator, Integer isValid) {
		try {
			if (isNull(number) == true || isNull(operator) == true || isNull(isValid) == true) {
				throw new NullPointerException();
			}
			switch (operator) {
			case "==":
				if (number == isValid) {
					return true;
				}
			case "!=":
				if (number != isValid) {
					return true;
				}
			case "<=":
				if (number <= isValid) {
					return true;
				}
			case ">=":
				if (number >= isValid) {
					return true;
				}
			case ">":
				if (number > isValid) {
					return true;
				}
			case "<":
				if (number >= isValid) {
					return true;
				}
			default:
				return false;
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
		}
		return false;
	}

	public void setSecond(Integer second) {
		try {
			if ((isValidNumber(second, ">=", 0) == true && isValidNumber(second, "<=", 59) == true)) {
				this.second = second;
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.exit(0);
		}

	}

	public boolean isAm() {
		return this.am;
	}

	public void setTwentyfourHour(Integer hour) {
		try {
			if ((isValidNumber(hour, ">=", 0) == true && isValidNumber(hour, "<=", 23) == true)) {
				this.twentyfourHour = hour;
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			System.exit(0);
		}

	}

	public Integer getTwentyfourHour() {
		return this.twentyfourHour;
	}

}