$(function () {
//    $.getJSON("https://www.highcharts.com/samples/data/jsonp.php?filename=usdeur.json&callback=?", function (data) {
	$.getJSON("./resources/file/data.json", function (data) {
	
        Highcharts.chart('container', {
        	
            chart: {
                zoomType: 'x'
            },
            title: {
                text: 'HiCapture Sequence'
            },
            subtitle: {
                text: document.ontouchstart === undefined ?
                        'Click and drag in the plot area to zoom in' : 'Pinch the chart to zoom in'
            },
            xAxis: {
            	type : "category"
            },
            yAxis: {
            	min : 0,
                title: {
                    text: 'count'
                }
            },
            legend: {
                enabled: false
            },
            credits: {
	            enabled: false
	        },
	        plotOptions: {
                area: {
                    fillColor: {
                        linearGradient: {
                            x1: 0,
                            y1: 0,
                            x2: 0,
                            y2: 1
                        },
                        stops: [
                            [0, Highcharts.getOptions().colors[0]],
                            [1, Highcharts.Color(Highcharts.getOptions().colors[0]).setOpacity(0).get('rgba')]
                        ]
                    },
                    marker: {
                        radius: 2
                    },
                    lineWidth: 1,
                    states: {
                        hover: {
                            lineWidth: 1
                        }
                    },
                    threshold: null
                }
            },
            series: [{
            	type: 'area',
            	name : 'count',
            	data : data
            }]
        });
    });
});
