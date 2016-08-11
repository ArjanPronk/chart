/*
	Copyright 2016 Marceau Dewilde <m@ceau.be>

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package be.ceau.chart.options;

import java.util.Locale;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import be.ceau.chart.data.JavaScriptFunction;

@JsonInclude(Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Legend {

	/**
	 * @see #setDisplay(Boolean)
	 */
	private Boolean display;

	/**
	 * @see #setPosition(Legend.Position)
	 */
	private Position position;

	/**
	 * @see #setFullWidth(Boolean)
	 */
	private Boolean fullWidth;

	/**
	 * @see #setOnClick(JavaScriptFunction)
	 */
	private JavaScriptFunction onClick;

	/**
	 * @see #setLabels(LegendLabels)
	 */
	private LegendLabels labels;

	/**
	 * @see #setDisplay(Boolean)
	 */
	public Boolean getDisplay() {
	    return this.display;
	}

	/**
	 * Default {@code true}
	 * 
	 * Is the legend displayed
	 */
	public void setDisplay(Boolean display) {
	    this.display = display;
	}

	/**
	 * @see #setPosition(Legend.Position)
	 */
	public Position getPosition() {
	    return this.position;
	}

	/**
	 * Default {@code 'top'}
	 * 
	 * Position of the legend. Options are 'top' or 'bottom'
	 */
	public void setPosition(Legend.Position position) {
	    this.position = position;
	}

	/**
	 * @see #setFullWidth(Boolean)
	 */
	public Boolean getFullWidth() {
	    return this.fullWidth;
	}

	/**
	 * Default {@code true}
	 * 
	 * Marks that this box should take the full width of the canvas (pushing down other boxes)
	 */
	public void setFullWidth(Boolean fullWidth) {
	    this.fullWidth = fullWidth;
	}

	/**
	 * @see #setOnClick(JavaScriptFunction)
	 */
	public JavaScriptFunction getOnClick() {
	    return this.onClick;
	}

	/**
	 * Default {@code function(event, legendItem) {}}
	 * 
	 * A callback that is called when a click is registered on top of a label item
	 */
	public void setOnClick(JavaScriptFunction onClick) {
	    this.onClick = onClick;
	}

	/**
	 * @see #setLabels(LegendLabels)
	 */
	public LegendLabels getLabels() {
	    return this.labels;
	}

	/**
	 * Default {@code -}
	 * 
	 * See the Legend Label Configuration section below.
	 */
	public void setLabels(LegendLabels labels) {
	    this.labels = labels;
	}
	
	public static enum Position {

		TOP,
		BOTTOM;

		private final String serialized;

		private Position() {
			this.serialized = name().toLowerCase(Locale.ENGLISH);
		}

		@Override
		public String toString() {
			return this.serialized;
		}

	}
	
}