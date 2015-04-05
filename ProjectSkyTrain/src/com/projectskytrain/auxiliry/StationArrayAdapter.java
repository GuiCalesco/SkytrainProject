package com.projectskytrain.auxiliry;

import java.util.ArrayList;

import com.example.projectskytrain.R;
import com.projectskytrain.constants.Line;
import com.projectskytrain.constants.StationEnum;

import android.content.Context;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class StationArrayAdapter extends ArrayAdapter<StationEnum> {
	  private final Context context;
	  private final ArrayList<StationEnum> values;

	  public StationArrayAdapter(Context context, ArrayList<StationEnum> values) {
	    super(context, R.layout.rowlayout, values);
	    this.context = context;
	    this.values = values;
	  }

	  @Override
	  public View getView(int position, View convertView, ViewGroup parent) {
	    LayoutInflater inflater = (LayoutInflater) context
	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	    View rowView = inflater.inflate(R.layout.rowlayout, parent, false);
	    TextView txtLine = (TextView) rowView.findViewById(R.id.txtLine);
	    TextView txtStation = (TextView) rowView.findViewById(R.id.txtStation);
	    StationEnum station = values.get(position);
	    int stationLine = station.getLine();
	    String stationName = station.getName();
	    txtStation.setText(stationName);
	    
	    switch(stationLine){
	    case Line.CANADA_LINE:
	    	txtLine.setText("");
	    	txtLine.setCompoundDrawablesWithIntrinsicBounds( R.drawable.canada, 0, 0, 0);
	    	break;
	    case Line.EVERGREEN_LINE:
	    	txtLine.setText("");
	    	txtLine.setCompoundDrawablesWithIntrinsicBounds( R.drawable.evergreen, 0, 0, 0);;
	    	break;
	    case Line.EXPO_AND_MILLENNIUM_LINE:
	    	txtLine.setText("");
	    	txtLine.setCompoundDrawablesWithIntrinsicBounds( R.drawable.expoandmille, 0, 0, 0);
	    	break;
	    case Line.EXPO_LINE:
	    	txtLine.setText("");
	    	txtLine.setCompoundDrawablesWithIntrinsicBounds( R.drawable.expo, 0, 0, 0);
	    	break;
	    case Line.MILLENNIUM_LINE:
	    	txtLine.setText("");
	    	txtLine.setCompoundDrawablesWithIntrinsicBounds( R.drawable.millenium, 0, 0, 0);
	    	break;
	    }
	    

	    return rowView;
	  }
	 
}
